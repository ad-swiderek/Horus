import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        for (Block block : this.blocks) {
            if (block.getColor().equals(color)) {
                return Optional.of(block);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> foundBlocks = new ArrayList<>();
        for (Block block : this.blocks) {
            if (block.getMaterial().equals(material)) {
                foundBlocks.add(block);
            }
        }
        return foundBlocks;
    }

    @Override
    public int count() {
        int count = 0;
        for (Block block : this.blocks) {
            count += block.getChildrenCount();
        }
        return count;
    }
}
