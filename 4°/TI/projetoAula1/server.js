const express = require("express")
const app = new express()


// - import another dependences 
// - import new components

/*
API rotes
- GET
- POST
- DELETE
- PUT
 */

app.get('/', function(req, res){    //  req = requisição  |  res = resposta
    res.send("Hello, nice to meet you.")
})


app.get('/veiculos', function(req, res){
    const ID = Number(req.params.id)
    if(ID == 1)
        res.send("Página de veiculos")
    else if(ID==2)
        res.send("Página id 2")
    else if(ID==3)
        res.send("Página id 3")
    else if(ID==4)
        res.send("Página id 4")
    else
        res.send("Chapo, tá se fazendo irmão")
})





app.listen('3000',function(){
    console.log("Servidor rodando na porta 3000: http://localhost:3000")
})