$(function() {
    $(function() {
        // Initialize form validation on the registration form.
        // It has the name attribute "registration"
        $("form[name='add_data']").validate({
            // Specify validation rules
            rules: {
                username: {
                    required: true,
                    minlength: 3
                },

                login:  {
                    required: true,
                    minlength: 5
                },

                password:  {
                    required: true,
                    minlength: 5
                }
            },

            messages: {
                username: "Please enter your name, min 3 char",
                login: "Please enter your login, min 5 char",
                password: "Please enter your password, min 5 char"
            },

            submitHandler: function(form) {
                form.submit();
            }
        });
    });

});