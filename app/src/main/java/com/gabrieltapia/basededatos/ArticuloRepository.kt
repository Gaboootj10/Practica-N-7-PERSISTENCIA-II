package com.gabrieltapia.basededatos

import kotlinx.coroutines.flow.Flow

class ArticuloRepository (private val dao: ArticuloDao){
    suspend fun insertar(articulo: Articulo) =
        dao.insertar(articulo)

    suspend fun actualizar(articulo: Articulo) =
        dao.actualizar(articulo)

    suspend fun eliminarPorCodigo(codigo: Int) =
        dao.eliminarPorCodigo(codigo)

    suspend fun buscarPorCodigo(codigo: Int) =
        dao.buscarPorCodigo(codigo)

    fun listarTodos(): Flow<List<Articulo>> =
        dao.listarTodos()
}