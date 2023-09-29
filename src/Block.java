public interface Block {
    String getColor();
    String getMaterial();

    default int getChildrenCount() {
        return 1;
    }
}
