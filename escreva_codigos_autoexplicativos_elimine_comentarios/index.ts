//  FORMA INCORRETA

function checkIfValidNumber(num: number): boolean {
  if (num <= 0) return false;
  if (num % 1 !== 0) return false;
  if (num > 1000) return false;
  return true;
}

// FORMA CORRETA
function isValidForCalculation(number: number) {
  const isPositive = number > 0;
  const isInteger = number % 1 === 0;
  const isNotTooLarge = number <= 1000;
  return isPositive && isInteger && isNotTooLarge;
}
