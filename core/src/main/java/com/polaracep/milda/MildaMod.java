package com.polaracep.milda;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.polaracep.milda.init.EntityInit;
import com.polaracep.milda.init.ItemInit;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MildaMod.MOD_ID)
public class MildaMod
{
	// Mod ID
	public static final String MOD_ID = "milda";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    

    public MildaMod() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ItemInit.register(eventBus);
        
        EntityInit.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }


    
}
