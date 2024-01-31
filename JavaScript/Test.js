
htmlRecover = document.body

function test(){
    document.getElementById("button").innerHTML = "goodbye :("
    console.log("waiting")
    sleep(2000).then(() => {
        console.log('done');
        document.write('<h2>you murderer</h2>',
         '<button id = "button" type = "button" onclick = "back()">revive?</button>',
        '<source> src = Test.js </source>')
    })
    console.log(htmlRecover)
    


}
function back(){
    document.body.replaceWith(htmlRecover)

}

function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
  }