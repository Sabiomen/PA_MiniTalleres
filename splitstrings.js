//https://www.codewars.com/kata/515de9ae9dcfc28eb6000001//

function solution(str){
    if (str.length % 2 !== 0) {
     str += '_';
   }
   
   let result = [];
   for (let i = 0; i < str.length; i += 2) {
     result.push(str[i] + str[i + 1]);
   }
   
   return result;
}
 