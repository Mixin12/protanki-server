package jp.assasans.protanki.server.commands

enum class CommandCategory(val key: String) {
  System("system"),
  Ping("ping"),

  Auth("auth"),
  @Suppress("SpellCheckingInspection") Registration("registration"),
  PasswordRestore("restore"),

  Lobby("lobby"),
  LobbyChat("lobby_chat"),

  Garage("garage"),

  Battle("battle"),
  BattleChat("chat"),
  BattleSelect("battle_select");

  companion object {
    private val map = CommandCategory.values().associateBy(CommandCategory::key)

    fun get(key: String) = map[key]
  }
}