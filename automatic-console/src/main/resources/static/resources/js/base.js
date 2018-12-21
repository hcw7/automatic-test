/**
 * Created by chaowei.hu on 2016/3/3.
 */
(function() {
    // selectAll definition
    $.fn.selectAll = function (options) {
        // defaults settings
        var defaults = {
            globleId: 'selectAll',
            name: 'chb'
        };
        // initializes s settings
        var opts = $.extend(defaults, options);
        // implement
        $("#" + opts.globleId).unbind('click').click(function (e, el) {
            var c = $(this).is(':checked');
            $("[name='" + opts.name + "']").each(function () {
                $(this).attr("checked", c);
            });
        });
    };
    // trans definition
    $.extend({
        trans: function (options) {
            // defaults settings
            var defaluts = {};
            // initializes s settings
            var opts = $.extend({}, defaluts, options);
            var value = opts.key;
            // query the cache
            if ($.data($body_cache, opts.type)) {
                value = $.data($body_cache, opts.type)[opts.key];
            } else {
                // get from the hosts
                $.ajax({
                    type: "POST",
                    url: basePath + "/common/queryDicItemsByType.do",
                    dataType: "json",
                    data: {
                        dicType: opts.type
                    },
                    async: false,
                    success: function (data) {
                        if (data.resultCode == '0000') {
                            $.data($body_cache, opts.type, data.data);
                            value = data.data[opts.key];
                        }
                    }
                });
            }
            if (!value) value = opts.key;
            return value;
        },
        startMaskLayer: function () {
            //add MaskLayer on body
            $('body').addClass("maskLayer");
            $('body').append('<div class="page-loading"><img src="' + basePath + '/resources/img/loading-spinner-grey.gif"/><span>&nbsp;&nbsp;Loading...</span></div>');
        },
        endMaskLayer: function () {
            //remove MaskLayer on body
            $('.page-loading').remove();
            $('body').removeClass("maskLayer");
        },
        exportStartSet: function () {
            $('body').append('<div class="page-loading" style="background-color: #def"><marquee direction="right">正在导出，请稍后...</marquee></div>');
            $("a[name^='export']").addClass("disabled");
        },
        exportEndtSet : function () {
            $('.page-loading').remove();
            $("a[name^='export']").removeClass("disabled");
        },
        alert: function (message) {
            var $alert, css;
            $alert = $("<div>");
            $alert.attr("class", "bootstrap-growl alert alert-info alert-dismissible");
            $alert.append("<button  class=\"close\" data-dismiss=\"alert\" type=\"button\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>");
            $alert.append(message);
            css = {
                "position": "fixed",
                "margin": 0,
                "top": "60px",
                "z-index": "9999",
                "display": "none",
                "width": "auto",
                "min-width": "200px",
                "right": "100px"
            };
            $alert.css(css);
            var elem = $alert.insertAfter($("body"));
            elem.delay(100).fadeIn(300).delay(1500).fadeOut(1500);
        },
        back: function () {
            $('.page-sidebar .page-sidebar-menu .sub-menu .active > a')[0].click();
        },
        multiselect: function () {
            $('.multiselect').multiselect({
                enableFiltering: true,
                nonSelectedText: "无选择",
                allSelectedText: "共选择",
                selectAllText: '全选',
                nSelectedText: "选择",
                buttonWidth: "110px",
                maxHeight: '300',
                buttonClass: 'btn btn-default input-sm',
                includeSelectAllOption: true
            });
        },
        selectSearch:function () {
            $(".selectpicker").attr("data-live-search", "true");
            $(".selectpicker").attr("data-size", "7");
            $('.selectpicker').selectpicker('render');
            $('.selectpicker').selectpicker('refresh');
            $('.selectpicker').selectpicker('setStyle', 'input-sm', 'add');
        }
    });
})();


