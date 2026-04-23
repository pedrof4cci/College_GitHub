const express = require("express");
const router = express.Router();

const itens = require('../data/itens.js');//mook = dados em array

router.get("/", (req,res)=>{
    res.status(200).json(itens);
})

router.get("/:id", (req,res)=>{
    const id = Number(req.params.id); //converter em número

    if(isNaN(id)){ //valida se é numero
        return res.status(400).json({"mensagem": "Formato inválido"})
    }

    if (itens.length == 0){ //valida se não está vazio
        return res.status(404).json({"mensagem": "Lista vazia"})
    }

    const item = itens.find(i => i.id === id);

    if(!item){ //não encontrado
        return res.status(404).json({"mensagem": "Registro não encontrado"})
    }

    return res.status(200).json(item);


})


router.post("/", (req,res)=>{
    const {nome, preco, fornecedorId} = req.body

    const precoNumber = Number(preco);
    const fornecedorIdNumber = Number(fornecedorId)

    if(!nome || isNaN(fornecedorIdNumber) || isNaN(precoNumber)){
        return res.status(400).json({"mensagem": "dados invalidos"});
    }

    const novoItem = {
        id: itens.length +1,
        nome,
        preco: precoNumber,
        fornecedorId: fornecedorIdNumber
    }
    itens.push(novoItem);

    return res.status(200).json(
        {
            "mensagem": "item cadastrado com sucesso.",
            novoItem
        }
    )
})

module.exports = router;