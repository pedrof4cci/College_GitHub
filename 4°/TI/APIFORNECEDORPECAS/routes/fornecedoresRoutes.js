const express = require("express");
const router = express.Router();

const fornecedores = require('../data/fornecedores.js');

router.get("/", (req,res)=>{
    res.status(200).json(fornecedores);
})
module.exports = router;