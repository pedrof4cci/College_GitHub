<?php

    class Conexao {
        private static $instancia;

        public static function getConexao(){
            if(!isset(self::$instancia)) {
                $host = "localhost";
                $dbname = "mini_projeto";
                $user = "root";
                $pass = "pepperHot0@00";

                try{
                    self::$instancia = new PDO("mysql:host=localhost:3306;dbname=mini_projeto", $user, $pass);

                    self::$instancia->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
                } catch (PDOException $e) {
                    die("Erro ao realizar a conexão com o banco: " . $e->getMessage());
                }
            }
            return self::$instancia;
        }
    }