import java.util.List;

public interface CompositeBlock extends Block {
    List<Block> getBlocks();

    default int getChildrenCount() {
        int count = 0;
        for (Block block : getBlocks()) {
            count += block.getChildrenCount();
        }
        return count;
    }
}
