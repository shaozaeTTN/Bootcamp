let foo = { 
  a: 1,
  b: { 
    c: 2,
  },
}

let bar = JSON.parse(JSON.stringify(foo));

foo.b.c = 20;
console.log(foo);
console.log(bar);
