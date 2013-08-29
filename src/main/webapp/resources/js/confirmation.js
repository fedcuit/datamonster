$(function () {
    var load = function () {
        $.getJSON('/application', function (data) {
            $('#info').text(JSON.stringify(data)).closest('#congratulation').show();
            $('.progress').hide();
        });
    };
    $('.bar').progressbar({
        transition_delay: 300,
        refresh_speed: 2000,
        done: load,
        display_text: 'Waiting for pushing data'
    });
});

