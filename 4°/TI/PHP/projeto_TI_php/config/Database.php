<?php

class Database{
    private static $conn;

    public static function conectar(){
        if(!self::$conn){
            self::$conn = new PDO(
                "mysql:host=localhost;dbname=mini_projeto;charset=utf8mb4",
                "root",
                "pepperHot0@00",
                [
                    PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
                    PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
                ]
            );
        }
        return self::$conn;
    }   
}
