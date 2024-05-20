package br.com.alura.challengeliterAlura.service;

public interface IConverteDados {
   <T> T converterDados (String json, Class<T> classe);
}
