package com.polaracep.milos.init;

import com.polaracep.milos.MilosMod;
import com.polaracep.milos.entity.MilosVozicekEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {

	public EntityInit() {
		
	}
	
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MilosMod.MOD_ID);
	
	public static final RegistryObject<EntityType<MilosVozicekEntity>> MILOS_VOZICEK = ENTITIES.register("milos_vozicek", 
			() -> EntityType.Builder.of(MilosVozicekEntity::new, MobCategory.CREATURE)
			.sized(1.0f, 1.0f)
			.build(new ResourceLocation(MilosMod.MOD_ID, "milos_vozicek").toString()));
	
	
	public static void register(IEventBus eventBus) {
	    ENTITIES.register(eventBus);
	}
}
