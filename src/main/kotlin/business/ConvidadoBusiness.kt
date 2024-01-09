package business

import entity.Convite

class ConvidadoBusiness()  {

    fun maiorDeIdade(idade: Int) : Boolean = idade >= 18

    fun validaTipo(convite: Convite) : Boolean {

        return convite.tipo == "comum" || convite.tipo == "premium" || convite.tipo == "vip"
    }
    fun validaCodigo(convite: Convite) : Boolean {

        return (convite.tipo == "comum" && convite.codigo.startsWith("xt")) ||
                ((convite.tipo == "premium" || convite.tipo == "vip") && convite.codigo.startsWith("xl"))
    }
}