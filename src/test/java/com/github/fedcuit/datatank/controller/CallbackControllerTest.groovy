package com.github.fedcuit.datatank.controller

import org.junit.Test

import static org.fest.assertions.api.Assertions.assertThat

class CallbackControllerTest {

    @Test
    void shouldDumpFormDataToFile() {
        def formData = '''
            {
              "form": "xd0gLh",
              "entry": {
                "serial_number": 123,
                "field_5": "选项1",
                "field_6": "选项1",
                "field_11": "这是一段文字",
                "creator_name": "这是一行文字",
                "created_at": "2013-08-26T08:58:00Z",
                "updated_at": "2013-08-26T08:58:00Z"
              }
            }
            '''
        def controller = new CallbackController()
        controller.callback(formData)

        def dumpedData = this.getClass().getResourceAsStream('/application.json').text
        assertThat(dumpedData).isEqualTo(formData)
    }

}
