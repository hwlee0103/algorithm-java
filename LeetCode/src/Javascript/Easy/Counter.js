/**
 * Level : Easy
 * Title : 2620. Counter
 * Topic : -
 *
 * Started : 2025-11-19
 * Solved : 2025-11-19
 * Time: -
 * Algorithm: Simulation
 *
 *
 *
 */

var createCounter = function (n) {
    var cnt = 0;
    return function () {
        var answer = cnt + n;
        cnt = cnt + 1;
        return answer;
    };
};