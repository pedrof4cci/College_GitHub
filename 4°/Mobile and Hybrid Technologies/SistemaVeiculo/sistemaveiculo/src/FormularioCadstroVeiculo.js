import { useState } from "react"
import { StyleSheet, Text, TextInput, View } from "react-native"


export default function FormularioCadastroVeiculo(){
    
    const [modelo, setModelo] = useState()
    const [ano, setAno] = useState()
    const [cor, setCor] = useState()
    const [preco, setPreco] = useState()


    return(
        <View>
            <Text>Cadastro de Veículo</Text>
            <TextInput
                style={estilo.entrada}
                placeholder="Modelo"
                value={modelo}
                onChangeText={setModelo}
            />
            <TextInput
                style={estilo.entrada}
                placeholder="Ano (ex: 2026)"
                value={ano}
                onChangeText={setAno}
            />
            <TextInput
                style={estilo.entrada}
                placeholder="Cor"
                value={cor}
                onChangeText={setCor}
            />
            <TextInput
                style={estilo.entrada}
                placeholder="Preço"
                value={preco}
                onChangeText={setPreco}
            />
            {
                modelo && <Text>Modelo: {modelo}</Text>
            }
            {
                ano && <Text>Ano: {ano}</Text>
            }
            {
                cor && <Text>Cor: {cor}</Text> 
            }
            {
                preco && <Text>Perço: {preco}</Text>
            }
            
            
            
            
            
        </View>
    )
}

const estilo = StyleSheet.create({
    entrada:{
        marfinTop: 10,
        borderWidth: 1,
        borderRadius: 7,
        height:30,

    }
})