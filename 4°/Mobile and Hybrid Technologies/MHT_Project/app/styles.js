import { StyleSheet } from 'react-native';

export const styles = StyleSheet.create({
    container: {
        flex: 1,
        padding: 20,
        backgroundColor: '#f5f5f5',
    },
    titulo: {
        fontSize: 24,
        fontWeight: 'bold',
        marginBottom: 20,
        marginTop: 40,
    },
    card: {
        padding: 15,
        borderWidth: 1,
        borderColor: '#ccc',
        borderRadius: 8,
        marginBottom: 10,
    },
    nome: {
        fontSize: 18,
        fontWeight: 'bold',
    },





    modalFundo: {
        flex: 1,
        backgroundColor: 'rgba(0,0,0,0.5)', 
        justifyContent: 'center',
        alignItems: 'center',
    },
    modalConteudo: {
        width: '80%',
        backgroundColor: 'white',
        padding: 20,
        borderRadius: 15,
        elevation: 5, 
    },
    botaoAdicionar: {
        backgroundColor: '#007AFF',
        padding: 10,
        borderRadius: 5,
        marginTop: 15,
        alignItems: 'center',
    },
    textoBotao: {
        color: 'white',
        fontWeight: 'bold',
    },





    imagemCard: {
    width: '100%',
    height: 150,
    borderRadius: 8,
    marginBottom: 10,
    },
    imagemModal: {
    width: '100%',
    height: 200,
    borderRadius: 10,
    marginBottom: 15,
    },
});