$(function() {
	var cols = [
		{title:"主键id",name:"id",align:"center",hidden:true},
		{title:"姓名",name:"name",align:"center"},
		{title:"礼金",name:"money",align:"center"},
		{title:"操作",name:"operation",align:"center",renderer:function() {
			return "<a id='view' href='javascript:void(0);'>查看</a>&nbsp;&nbsp;&nbsp;"+"<a id='update' href='javascript:void(0);'>修改</a>&nbsp;&nbsp;&nbsp;"+
				"<a id='delete' href='javascript:void(0);'>删除</a>";
		}}
	];

	var mmGrid = $("#mmgrid_table").mmGrid({
		url:"select-all-git-money.action",
		cols:cols,
		width:"auto",
		height:"auto",
		fullWidthRows:true,
		nowrap:true,
		params:function() {
			return {"name":name};
		}
	});

	/**
	 * 新增
	 */
	$("#add").on("click",function() {
		alert("新增一条记录");
	});

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
			$.get("get-update-git-money.action?id="+item.id,function(data) {
				layer.open({
					title:"修改GitMoney",
					type:1,
					content:data,
					area: ["500px", "300px"],
					btn: ["修改", "取消"],
					yes: function() {
						alert("修改数据");
					}
				});
			});
			/**
			 * 删除
			 */
		}else {
			layer.confirm("你确定要删除吗？",{btn:["确定","取消"]},function() {
				$.get("delete-git-money.action?id="+item.id,function() {
					mmGrid.load();
					layer.closeAll();
				});
			});
		}
	});

	$("#select").on("click",function() {
		var name = $("#name").val();
		mmGrid.load({"name":name});
	});
});