import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    @Test
    fun updateExisting() {

        val service = WallService()
        service.add(Post(1,11,"Vladimir","new post Vladimir","23.04",1))
        service.add(Post(2,22,"Olga","new post Olga","24.04",2))
        service.add(Post(3,33,"Elena","new post Elena","25.04",3))


        val result = service.update(3)

        assertTrue(result)
    }
}