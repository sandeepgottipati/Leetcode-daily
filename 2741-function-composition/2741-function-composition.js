/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    let result=0;
    return function(x) {
       for(let i=functions.length-1;i>=0;i--){
             let func=functions[i];
             result=func(x);
             x=result;
       }
        return x;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */