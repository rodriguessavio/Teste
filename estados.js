
const sp = 67836.43;
const rj = 36678.66;
const mg = 29229.88;
const es = 27165.48;
const others = 19849.53;
const soma = sp + rj + mg + es + others;

console.log(`A soma dos valores é de R$${soma.toFixed(2)}`);

console.log(`Representação percentual de cada estado: \nSP: ${((sp / soma) * 100).toFixed(2)}%`);
console.log(`RJ: ${((rj / soma) * 100).toFixed(2)}%`);
console.log(`MG: ${((mg / soma) * 100).toFixed(2)}%`);
console.log(`ES: ${((es / soma) * 100).toFixed(2)}%`);

