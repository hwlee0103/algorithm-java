/**
 * Level : Medium
 * Title : Code Review Feedback
 * Topic : -
 *
 * Started : 2025-11-19
 * Solved : 2025-11-19
 * Time: -
 * Algorithm: React
 *
 *
 *
 */

import React, { useState } from "react";

const aspects = [
    "Readability",
    "Performance",
    "Security",
    "Documentation",
    "Testing",
];

const FeedbackSystem = () => {
    // 각 항목별 up / down 카운트 상태
    const [votes, setVotes] = useState(
        aspects.map(() => ({ upvotes: 0, downvotes: 0 }))
    );

    const handleVote = (index, type) => {
        setVotes((prev) =>
            prev.map((item, i) => {
                if (i !== index) return item;
                return {
                    ...item,
                    upvotes: type === "up" ? item.upvotes + 1 : item.upvotes,
                    downvotes: type === "down" ? item.downvotes + 1 : item.downvotes,
                };
            })
        );
    };

    return (
        <div className="my-0 mx-auto text-center w-mx-1200">
            <div className="flex wrap justify-content-center mt-30 gap-30">
                {aspects.map((title, index) => (
                    <div key={title} className="pa-10 w-300 card">
                        <h2>{title}</h2>
                        <div className="flex my-30 mx-0 justify-content-around">
                            <button
                                className="py-10 px-15"
                                data-testid={`upvote-btn-${index}`}
                                onClick={() => handleVote(index, "up")}
                            >
                                👍 Upvote
                            </button>
                            <button
                                className="py-10 px-15 danger"
                                data-testid={`downvote-btn-${index}`}
                                onClick={() => handleVote(index, "down")}
                            >
                                👎 Downvote
                            </button>
                        </div>
                        <p className="my-10 mx-0" data-testid={`upvote-count-${index}`}>
                            Upvotes: <strong>{votes[index].upvotes}</strong>
                        </p>
                        <p className="my-10 mx-0" data-testid={`downvote-count-${index}`}>
                            Downvotes: <strong>{votes[index].downvotes}</strong>
                        </p>
                    </div>
                ))}
            </div>
        </div>
    );
};

export default FeedbackSystem;