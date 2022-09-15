package icu.harx.plugin

import dotty.tools.dotc.plugins.{PluginPhase, StandardPlugin}

/** pojo 编译器插件 */
class PojoPlugin extends StandardPlugin:
  override val name = "pojoPlugin"
  override val description = "compiler plugin for @pojo"

  override def init(ignored: List[String]): List[PluginPhase] =
    List(new PojoPluginPhase)
end PojoPlugin
