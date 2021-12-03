package com.polaracep.milda.init;

import com.polaracep.milda.MildaMod;
import com.polaracep.milda.entity.MilosEntity;
import com.polaracep.milda.entity.MilosVozicekEntity;

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
	
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MildaMod.MOD_ID);
	
	public static final RegistryObject<EntityType<MilosEntity>> MILOS = ENTITIES.register("milos", 
			() -> EntityType.Builder.of(MilosEntity::new, MobCategory.CREATURE)
			.sized(0.6f, 1.8f)
			.build(new ResourceLocation(MildaMod.MOD_ID, "milos").toString()));
	
	public static final RegistryObject<EntityType<MilosVozicekEntity>> MILOS_VOZICEK = ENTITIES.register("milos_vozicek", 
			() -> EntityType.Builder.of(MilosVozicekEntity::new, MobCategory.CREATURE)
			.sized(0.6f, 1.4f)
			.build(new ResourceLocation(MildaMod.MOD_ID, "milos_vozicek").toString()));
	
	
	public static void register(IEventBus eventBus) {
	    ENTITIES.register(eventBus);
	}
}
