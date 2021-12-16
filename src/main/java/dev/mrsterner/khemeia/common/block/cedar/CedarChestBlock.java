package dev.mrsterner.khemeia.common.block.cedar;

import dev.mrsterner.khemeia.common.registry.KhemeiaEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.util.math.BlockPos;

import java.util.function.Supplier;

public class CedarChestBlock extends KhemeiaChestBlock {
    public CedarChestBlock(Settings settings, Supplier<BlockEntityType<? extends ChestBlockEntity>> supplier, boolean trapped) {
        super(settings, supplier, trapped);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CedarChestBlockEntity(KhemeiaEntityTypes.CEDAR_CHEST_BLOCK_ENTITY, pos, state, trapped);
    }
}
