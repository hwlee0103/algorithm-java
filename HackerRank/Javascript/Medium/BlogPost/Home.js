import React, { useState } from "react";
import Input from "./Input";
import PostDisplay from "./PostDisplay";

function Home() {
    const [title, setTitle] = useState("");
    const [description, setDescription] = useState("");

    const handlePost = () => {
        if(!title.trim() || !description.trim()) {
            return;
        }

        setTitle(title);
        setDescription(description);

    }

    return (
        <div className="text-center ma-20">
            <div className="mb-20">
                <Input title={title} description={description} />
                <button data-testid="create-button" className="mt-10" onClick={handlePost}>
                    Create Post
                </button>
            </div>
            <div className="posts-section">
                <PostDisplay />
            </div>
        </div>
    );
}

export default Home;
