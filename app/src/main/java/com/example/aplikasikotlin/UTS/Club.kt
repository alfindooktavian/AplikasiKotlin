package com.example.aplikasikotlin.UTS

data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,
    val efl: Int,
    val ucl: Int,
    val uel: Int,
) {
    val totalTrophies: Int
        get() = epl + fa + efl + ucl + uel
}

fun Club.recap(): String {
    return "$name has won $totalTrophies trophies in total, including $epl EPL titles, $fa FA Cups, $efl EFL Cups, $ucl Champions League titles, and $uel UEFA Cup titles."
}
