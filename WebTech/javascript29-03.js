let a = 10;
let b =20;
let c = 5*2 + (a++) - (++b) * (b++) + (++a);
console.log(a,b,c);

let x =10;
let y =5;
let z=25;
x=y;
x=y=z;
console.log(x,y,z);