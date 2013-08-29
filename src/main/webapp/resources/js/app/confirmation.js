$(function () {
    var load = function () {
        $.getJSON('/application', function (data) {
            var entries = data.entry;
            for (var prop in  entries) {
                $('.' + prop).text(entries[prop]);
            }
            $('#summary').fadeIn().show();
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

