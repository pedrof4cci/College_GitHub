const express = require("express");
const router = express.Router();

const itens = require('../data/itens.js');//mook = dados em array

router.get("/", (req,res)=>{
    res.status(200).json(itens);
})

module.exports = router;