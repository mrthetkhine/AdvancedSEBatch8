function div(a,b)
{
    if(b==0)
    {
        return [undefined, new Error("Division by zero error")];
    }
    return [a/b, undefined];
}
let [result, error] = div(10,2);
if(error)
{
    console.log(error.message);
    //let a = 1 + 2;
}
else
{
    console.log(result);
}