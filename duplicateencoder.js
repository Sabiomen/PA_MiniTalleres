//https://https://www.codewars.com/kata/54b42f9314d9229fd6000d9c//

function duplicateEncode(word){
    word = word.toLowerCase();
    
    let charCount = {};
    
    for (let char of word) {
      charCount[char] = (charCount[char] || 0) + 1;
    }
    
    return word.split('').map(char => charCount[char] > 1 ? ')' : '(').join('');
  }
  