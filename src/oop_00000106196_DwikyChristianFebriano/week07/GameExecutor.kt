package oop_00000106196_DwikyChristianFebriano.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Awas! Kamu diserang oleh monster: ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            val (itemName, itemDamage, itemRarity) = event.item
            println("Hore! Kamu mendapatkan loot: $itemName (Damage: $itemDamage, Rarity: $itemRarity)")
        }
        is BattleState.GameOver -> {
            println("GAME OVER! Alasan: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu telah memasuki zona aman. Silakan beristirahat untuk memulihkan HP.")
        }
    }
}