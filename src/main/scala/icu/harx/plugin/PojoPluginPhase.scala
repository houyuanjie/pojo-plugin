package icu.harx.plugin

import dotty.tools.dotc.ast.Trees.*
import dotty.tools.dotc.ast.tpd
import dotty.tools.dotc.core.Constants.Constant
import dotty.tools.dotc.core.Contexts.Context
import dotty.tools.dotc.core.Decorators.*
import dotty.tools.dotc.core.Flags.*
import dotty.tools.dotc.core.StdNames.*
import dotty.tools.dotc.core.Symbols.*
import dotty.tools.dotc.plugins.PluginPhase

/** 处理语法树 */
class PojoPluginPhase extends PluginPhase:
  import tpd.*

  override val phaseName = "pojoPluginPhase"
  override val runsAfter: Set[String] = Set("parser")

  override def transformTypeDef(tree: TypeDef)(using ctx: Context): Tree =
    tree match
      // class 类声明
      case classDef @ TypeDef(name, Template(constr, _, _, _)) =>
        /** 该类是 case class 且由 @pojo 注解 */
        val isPojoCaseClass = classDef.mods.is(Case) &&
          classDef.mods.annotations.contains(???)
        
        if isPojoCaseClass then 
          ???
        else classDef
      // 其它类型声明
      case typeDef => typeDef
end PojoPluginPhase
