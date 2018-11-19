var gitMoney = function() {
	var mmGrid;
	/*
	 * 初始化函数
	 **/
	function Init() {
		mmGridTable();//表格控件渲染函数
		pageContent();//页面js函数执行
	}

	/*
	 * 表格控件函数
	 **/
	function mmGridTable() {
		var cols = [
			{title:"主键id",name:"id",align:"center",hidden:true},
			{title:"姓名",name:"name",align:"center"},
			{title:"礼金",name:"money",align:"center"},
			{title:"操作",name:"operation",align:"center",renderer:function() {
				return "<a id='view' href='javascript:void(0);'>查看</a>&nbsp;&nbsp;&nbsp;"+"<a id='update' href='javascript:void(0);'>修改</a>&nbsp;&nbsp;&nbsp;"+
					"<a id='delete' href='javascript:void(0);'>删除</a>";
			}}
		];

		var mmPaginator = $('#page').mmPaginator();

		mmGrid = $("#mmgrid_table").mmGrid({
			url:"select-all-git-money.action",
			cols:cols,
			width:"auto",
			height:"auto",
			fullWidthRows:true,
			nowrap:true,
			params:function() {
				return {"name":name};
			},
			plugins:[
				mmPaginator
			]
		});

		// 表格事件
		mmGrid.on("cellSelected",function(e, item, rowIndex, colIndex) {
			var id = $(e.target).attr("id");
			/**
			 * 查看
			 */
			if(id == "view") {
				$.get("get-git-money.action?id="+item.id,function(data) {
					layer.open({
						title:"查看GitMoney",
						type:1,
						content:data,
						area: ["500px", "300px"],
						btn:["关闭"]
					});
				});
				/**
				 * 修改
				 */
			}else if(id == "update") {
				$.get("update-git-money-page.action?id="+item.id,function(data) {
					layer.open({
						title:"修改GitMoney",
						type:1,
						content:data,
						area: ["500px", "300px"],
						btn: ["修改", "取消"],
						yes: function() {
							var id = $("#queryId").val();
							var name = $("#updateName").val();
							var money = $("#updateMoney").val();
							var obj = {"id":id,"name":name,"money":money};
							var objStr = JSON.stringify(obj);
							var gitMoney = JSON.parse(objStr);
							$.post("update-git-money.action",gitMoney,function(data) {
								mmGrid.load();
								layer.closeAll();
							});
						}
					});
				});
				/**
				 * 删除
				 */
			}else {
				layer.confirm("你确定要删除吗？",{title:'提示'},function(index) {
					$.get("delete-git-money.action?id="+item.id,function() {
						mmGrid.load();
						layer.closeAll();
					});
				});
			}
			// 阻止事件冒泡
			e.stopPropagation();
		});

		//数据加载失败后执行。
		mmGrid.on('loadError', function(e, data) {
			var result = $.parseJSON(data.responseText);
			layer.msg(result.msg);
		});
	}

	/*
	 * 页面js函数
	 **/
	function pageContent() {
		/**
		 * 根据姓名查询
		 */
		$("#searchBtn").on("click",function() {
			var name = $("#name").val();
			mmGrid.load({"name":name});
		});

		/**
		 * 新增
		 */
		$("#addBtn").on("click",function() {
			$.get("add-git-money-page.action",function(data) {
				layer.open({
					title:"新增GitMoney",
					type:1,
					content:data,
					area: ["500px", "300px"],
					btn:["新增", "取消"],
					yes: function() {
						var name = $("#addName").val();
						var money = parseInt($("#addMoney").val());
						var obj = {"name":name,"money":money};
						var objStr = JSON.stringify(obj);
						var gitMoney = JSON.parse(objStr);
						$.post("add-git-money.action",gitMoney,function(data) {
							mmGrid.load();
							layer.closeAll();
						});
					}
				});
			});
		});
	}

	$(function () {
		Init();
	});

	return{
		MMGrid: function () {
			return mmGrid;
		},
		reloadMMGrid: function () {
			mmGrid.load();
		}
	};
}();