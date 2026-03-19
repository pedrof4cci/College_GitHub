import React from 'react';
import { View, Text, FlatList, TouchableOpacity } from 'react-native';
import { useRouter } from 'expo-router';
import { styles } from './styles';

export default function Carrinho() {
    const router = useRouter();

    const itensNoCarrinho = [];

    const total = itensNoCarrinho.reduce((soma, item) => soma + item.preco, 0);

    return (
        <View style={styles.container}>
            <TouchableOpacity onPress={() => router.back()}>
                <Text style={{ color: 'blue', marginTop: 20, marginBottom: 10 }}>← Voltar para a Loja</Text>
            </TouchableOpacity>

            <Text style={styles.titulo}>Meu Inventário</Text>

            <FlatList
                data={itensNoCarrinho}
                keyExtractor={(item, index) => index.toString()}
                renderItem={({ item }) => (
                    <View style={styles.card}>
                        <Text style={styles.nome}>{item.nome}</Text>
                        <Text>{item.preco} Essências Azuis</Text>
                    </View>
                )}
                ListEmptyComponent={
                    <Text style={{ textAlign: 'center', marginTop: 40, color: '#999' }}>
                        Sem itens no carrinho
                    </Text>
                }
            />

            <View style={{ borderTopWidth: 1, borderColor: '#ccc', paddingTop: 15, marginTop: 10 }}>
                <Text style={{ fontSize: 20, fontWeight: 'bold' }}>
                    Total: {total} Essências Azuis
                </Text>
            </View>
        </View>
    );
}