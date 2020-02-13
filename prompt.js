function simpl()
    {
    var p,r,t;
    p=parseFloat(prompt("Enter Principle Amount:"));
    r=parseFloat(prompt("Enter Rate Amount:"));
    t=parseFloat(prompt("Enter Time(year):"));
    var si=(p*r*t)/100;
    document.write("(Annual) Simple Interest is: "+si);
    }
