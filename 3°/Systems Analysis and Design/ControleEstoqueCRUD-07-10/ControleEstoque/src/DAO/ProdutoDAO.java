package DAO;
import Modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    public void inserir(Produto produto){
        String sql = "INSERT INTO produto (nome, preco, quantidade) VALUES (?, ?, ?)";

        try(
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)
                ){
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());

            stmt.executeUpdate();
            System.out.println("Produto cadastrado com sucesso!!!");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public List<Produto> listarTodos(){
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto order by id DESC";

        try(
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
                ){
            while(rs.next()){
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setPreco(rs.getDouble("preco"));
                produtos.add(p);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return produtos;
    }
    public void atualizar(Produto produto){
        String sql = "UPDATE produto SET nome = ?, preco = ?, quantidade = ? WHERE id = ?";
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getId());
            stmt.executeUpdate();
            System.out.println("Produto atualizado com sucesso");
        }catch (SQLException e){
            System.out.println("Erro: " + e.getMessage());
            //e.printStackTrace();
        }
    }
    public void excluir(int id){
        String sql = "DELETE FROM produto WHERE id = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Produto excluído com sucesso!");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}