package com.example.mislugares

interface RepositorioLugares {
    fun elemento(id: Int): Lugar
    fun añade(lugar: Lugar)
    fun nuevo(): Int
    fun borrar(id: Int)
    fun tamaño(): Int
    fun actualiza(id: Int, lugar: Lugar)

    fun añadeEjemplos() {
        añade(Lugar("Escuela Politécnica Superior de Gandía",
            "C/ Paranimf, 1 46730 Gandia (SP)",
            GeoPunto(0.166093, 38.995656), TipoLugar.EDUCACION,
            "", 962849300,  "http://www.epsg.upv.es",
            "Uno de los mejores lugares para formarse.", System.currentTimeMillis(), 3.0F))
        añade(Lugar("Al de siempre",
            "P.Industrial Junto Molí Nou - 46722, Benifla (Valencia)",
            GeoPunto(-0.190642, 38.925857), TipoLugar.BAR,
            "", 636472405, "", "", System.currentTimeMillis(), 3.0F))
        añade(Lugar("androidcurso.com", "ciberespacio",
            GeoPunto(0.0, 0.0), TipoLugar.EDUCACION,
            "", 962849300, "http://androidcurso.com",
            "Amplia tus conocimientos sobre Android.", System.currentTimeMillis(), 5.0F))
        añade(Lugar("Barranco del Infierno",
            "Vía Verde del río Serpis. Villalonga (Valencia)",
            GeoPunto(-0.295058, 38.867180), TipoLugar.NATURALEZA,
            "", 0, "http://sosegaos.blogspot.com",
            "Espectacular ruta para bici o andar", System.currentTimeMillis(), 4.0F))
        añade(Lugar("La Vital",
            "Avda. de La Vital, 0 46701 Gandía (Valencia)",
            GeoPunto(-0.1720092, 38.9705949), TipoLugar.COMPRAS,
            "", 962881070, "http://www.lavital.es",
            "El típico centro comercial", System.currentTimeMillis(), 2.0F))
    }
}