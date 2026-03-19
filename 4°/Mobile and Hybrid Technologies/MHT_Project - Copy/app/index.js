import React, {useState} from "react";
import { View, Text, FlatList, TouchableOpacity, Modal, Image} from "react-native";
import { useRouter } from 'expo-router';

import PRODUTOS from '../data/produtinhos.json';
import { styles } from "./styles";

export default function Index(){
    const router = useRouter();
    const [modalVisivel, setModalVisivel] = useState(false);
    const [itemSelecionado, setItemSelecionado] = useState(null);
    const [carrinho, setCarrinho] = useState([]);

    const renderItem = ({ item }) => (
        <TouchableOpacity style={styles.card} onPress={() => {
            setItemSelecionado(item);
            setModalVisivel(true);
        }}>
            <Image source={{ uri: item.img }} style={styles.imagemCard} />
            <Text style={styles.nome}>{item.nome}</Text>
            <Text>Preço: {item.preco} Essências Azuis</Text>
        </TouchableOpacity>
    );

    const adicionarAoCarrinho = (produto) => {
        setCarrinho([...carrinho, produto]);
        setModalVisivel(false); 
        alert(`${produto.nome} foi para o seu inventário!`);
    };

    return (
        <View style={styles.container}>
            <Text style={styles.titulo}>Loja de Campeões do League of Legends</Text>

            <TouchableOpacity 
                style={styles.botaoCarrinho} 
                onPress={() => router.push('/carrinho')}
            >
                <Text style={styles.textoBotao}>Ver Carrinho ({carrinho.length})</Text>
            </TouchableOpacity>
            
            <FlatList
                data={PRODUTOS}
                keyExtractor={(item) => item.id}
                renderItem={renderItem}  
            />

            <Modal
                transparent={true}
                visible={modalVisivel}
                onRequestClose={() => setModalVisivel(false)}
            >
                <View style={styles.modalFundo}>
                    <View style={styles.modalConteudo}>
                        {itemSelecionado && (
                            <>
                                <Image source={{ uri: itemSelecionado.img }} style={styles.imagemModal} />
                                <Text style={styles.nome}>{itemSelecionado.nome}</Text>
                                <Text>{itemSelecionado.descricao}</Text>
                                <Text style={styles.preco}>{itemSelecionado.preco} Essências</Text>

                                <TouchableOpacity 
                                    style={styles.botaoAdicionar}
                                    onPress={() => adicionarAoCarrinho(itemSelecionado)}
                                >
                                    <Text style={styles.textoBotao}>Adicionar ao Carrinho</Text>
                                </TouchableOpacity>

                                <TouchableOpacity onPress={() => setModalVisivel(false)}>
                                    <Text style={{ color: 'red', marginTop: 10 }}>Fechar</Text>
                                </TouchableOpacity>
                            </>
                        )}
                    </View>
                </View>
            </Modal>
        </View>
    );
}