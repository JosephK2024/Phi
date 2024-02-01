
htmlRecover = document.body

function test(){
    console.log(htmlRecover)
    document.getElementById("button").innerHTML = "goodbye :("
    console.log("waiting")
    sleep(2000).then(() => {
        console.log('done');
        document.getElementById("button").innerHTML = "Hello! :3";
        document.write('<h2>you murderer</h2>',
         '<button id = "button" type = "button" onclick = "back()">revive?</button>',)
    });
    console.log(htmlRecover);
}
function back(){
    document.body.replaceWith(htmlRecover);
    document.getElementById("heading").innerHTML = "IT WORKED";
    const newParagraph = document.createElement("p");
    newParagraph.setAttribute('id', 'maybe?');
    newParagraph.innerHTML = "does this work?"
    document.body.insertBefore('paragraphs', 'maybe?');
    try{
        document.getElementById('maybe?').innerHTML = "kinda";
    }catch(Error)
    {
        console.error(Error);
        console.log("it lies");
    }
}

function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
  }