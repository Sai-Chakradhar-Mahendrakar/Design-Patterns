import java.util.ArrayList;
import java.util.List;

// A Reusable Object
class Resource {
    public void reset() {
        System.out.println("Resetting Resource");
    }
    public void use() {
        System.out.println("Using Resource");
    }
}

// Object Pool
class ResourcePool {
    private List<Resource> availableResources = new ArrayList<>();

    public Resource acquire() {
        if (!availableResources.isEmpty()) {
            System.out.println("Acquired Resource from Pool");
            return availableResources.remove(availableResources.size() - 1);
        }
        System.out.println("Created New Resource");
        return new Resource();
    }

    public void release(Resource resource) {
        System.out.println("Releasing Resource back to Pool");
        resource.reset();
        availableResources.add(resource);
    }
}

public class ObjectPool {
    public static void main(String[] args) {
        ResourcePool pool = new ResourcePool();

        Resource res1 = pool.acquire();
        res1.use();

        Resource res2 = pool.acquire();
        res2.use();

        pool.release(res1);
        pool.release(res2);

        Resource res3 = pool.acquire();  // Reuses released resource
        res3.use();
    }
}
