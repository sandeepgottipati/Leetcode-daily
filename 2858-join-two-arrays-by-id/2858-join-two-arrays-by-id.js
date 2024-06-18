/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    const joinArray=[...arr1,...arr2];
    let result={};
    joinArray.map((ele)=>result[ele.id]={...result[ele.id],...ele});
    return [...Object.values(result)];
};