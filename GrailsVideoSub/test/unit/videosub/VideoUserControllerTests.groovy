package videosub



import org.junit.*
import grails.test.mixin.*

@TestFor(VideoUserController)
@Mock(VideoUser)
class VideoUserControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/videoUser/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.videoUserInstanceList.size() == 0
        assert model.videoUserInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.videoUserInstance != null
    }

    void testSave() {
        controller.save()

        assert model.videoUserInstance != null
        assert view == '/videoUser/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/videoUser/show/1'
        assert controller.flash.message != null
        assert VideoUser.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/videoUser/list'

        populateValidParams(params)
        def videoUser = new VideoUser(params)

        assert videoUser.save() != null

        params.id = videoUser.id

        def model = controller.show()

        assert model.videoUserInstance == videoUser
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/videoUser/list'

        populateValidParams(params)
        def videoUser = new VideoUser(params)

        assert videoUser.save() != null

        params.id = videoUser.id

        def model = controller.edit()

        assert model.videoUserInstance == videoUser
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/videoUser/list'

        response.reset()

        populateValidParams(params)
        def videoUser = new VideoUser(params)

        assert videoUser.save() != null

        // test invalid parameters in update
        params.id = videoUser.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/videoUser/edit"
        assert model.videoUserInstance != null

        videoUser.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/videoUser/show/$videoUser.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        videoUser.clearErrors()

        populateValidParams(params)
        params.id = videoUser.id
        params.version = -1
        controller.update()

        assert view == "/videoUser/edit"
        assert model.videoUserInstance != null
        assert model.videoUserInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/videoUser/list'

        response.reset()

        populateValidParams(params)
        def videoUser = new VideoUser(params)

        assert videoUser.save() != null
        assert VideoUser.count() == 1

        params.id = videoUser.id

        controller.delete()

        assert VideoUser.count() == 0
        assert VideoUser.get(videoUser.id) == null
        assert response.redirectedUrl == '/videoUser/list'
    }
}
