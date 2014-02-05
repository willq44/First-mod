package willq44.firstmod;

import willq44.firstmod.lib.Reference;
import willq44.firstmod.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class firstmod {
    
    @Instance(Reference.MOD_ID)
    public static firstmod instance;     
    
    @SidedProxy( clientSide = "willq44.firstmod.proxy.ClientProxy", serverSide = "willq44.firstmod.proxy.CommonProxy")
    public static CommonProxy proxy;
 
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    
    }
    
    @EventHandler 
    public void init(FMLInitializationEvent event) {
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
