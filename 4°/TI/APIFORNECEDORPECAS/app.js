const express = require("express");
require("dotenv").config();

const app = new express();

app.use(express.json());




const itensRoutes = require("./routes/itensRoutes"); //DECLARAMOS A ROTA NO APP

app.use("/itens", itensRoutes);


const fornecedoresRoutes = require("./routes/fornecedoresRoutes");

app.use("/fornecedores", fornecedoresRoutes);



const PORT = process.env.PORT || 5000  //PEGA A INFO DA PORTA NO .ENV OU RODA A PORTA QUE COLOCARMOS ALI, EX: 5000

app.listen(PORT, ()=>{
    console.log(`Servidor rodando na porta: ${PORT}`) //EXIBE EM QUAL PORTA TA RODANDO
})