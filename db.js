var db=[
  {Name:'Alekhya',Age:21,Salary:7000,DOB:'19-01-1999'},
  {Name:'Pranav',Age:54,Salary:800,DOB:'1-01-1966'},
  {Name:'Akash',Age:21,Salary:5000,DOB:'13-01-1999'},
  {Name:'Lokath',Age:35,Salary:6000,DOB:'17-01-1985'}
  
];
var sal =  db.filter(function(db) {
  return db.Salary > 30000
});

let method1=Object.assign({},sal);

console.log(method1);
//3rd
let group = db.reduce((r, a) => {
 
 r[a.Age] = [...r[a.Age] || [], a];
 return r;
}, {});
console.log("group", group);
//4th

let increment = [];
for (let k = 0; k< db.length; k++){
if (db[k].Salary < 1000 && db[k].Age>20){
let po = db[k].Salary * 5;
increment.push(po);}}

console.log(increment);
