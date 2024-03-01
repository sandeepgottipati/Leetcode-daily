/**
 * @param {string} s
 * @return {string}
 */
var maximumOddBinaryNumber = function(s) {
    let count=0;
    let splits=[...s];
    splits.forEach((s)=>{
        if(s==='1'){
            count++;
        }
    });
    let totalLen=s.length;
    let stringRes="";
    while(totalLen>1){
        if(count>1){
            stringRes+="1";
            count=count-1;
            totalLen--;
            continue;
        }
        stringRes+="0";
        totalLen--;
    }
    return stringRes+="1";
};